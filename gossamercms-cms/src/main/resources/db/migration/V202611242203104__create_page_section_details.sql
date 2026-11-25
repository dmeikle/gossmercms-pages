CREATE TABLE page_section_details (
    "id" UUID PRIMARY KEY,
    "sectionId" UUID NOT NULL,
    "sortOrder" INTEGER NOT NULL DEFAULT 0,
    "label" VARCHAR(255) NOT NULL,
    "value" VARCHAR,
    "deletedAt" TIMESTAMP,
    "createdAt" TIMESTAMP DEFAULT NOW(),
    "updatedAt" TIMESTAMP DEFAULT NOW(),
    CONSTRAINT "fk_page_section_details_sectionId" FOREIGN KEY ("sectionId") REFERENCES "page_sections" ("id")
);
CREATE INDEX "idx_page_section_details_sectionId" ON page_section_details ("sectionId", "sortOrder");
